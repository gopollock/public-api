#!/bin/bash
set -e

target_language=${1}
supported_language=("php" "java" "python" "cpp" "csharp" "dart" "go" "kotlin" "objc" "ruby")

if [[ " ${supported_language[*]} " != *" $target_language "* ]]; then
  echo "recieved unsupported language param: ${target_language}"
  echo "Supported paramas are: ${supported_language[*]}"
  exit 1
fi

this_script_path="$(cd "$(dirname "$0")" && pwd)"
protobuf_root_path=$this_script_path
services_path="${protobuf_root_path}/classtime/service"
dist_path="${protobuf_root_path}/generated-protos"

build_proto_service () {
  src_path=${1}

  mkdir -p $dist_path
  protoc \
    --proto_path $protobuf_root_path \
    "--${target_language}_out" $dist_path \
    $src_path/*.proto
}

for service_path in $services_path/*/; do
  # Remove the trailing slash from the directory name
  service_path=${service_path%/}
  # Extract processed directory name from its full path
  tail_service_path_name=$(basename "$service_path")

  echo "Builing $tail_service_path_name protos..."
  build_proto_service ${service_path}

done

echo "All protobufs are successfully built!"
