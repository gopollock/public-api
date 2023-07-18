#!/bin/bash
set -e

target_language=${1}
supported_language=("php" "java" "python" "cpp" "csharp" "dart" "go" "kotlin" "objc" "ruby")

if [[ " ${supported_language[*]} " != *" $target_language "* ]]; then
  echo "recieved unsupported language param: ${target_language}"
  echo "Supported paramas are: ${supported_language[*]}"
  exit 1
fi

this_script_dir="$(cd "$(dirname "$0")" && pwd)"
services_dir="${this_script_dir}/services"
root_dist_dir="${this_script_dir}/generated-protos"
common_deps_dir="${services_dir}/common-service"

build_proto_service () {
  src_path=${1}

  mkdir -p $root_dist_dir
  protoc \
    --proto_path $src_path \
    --proto_path $common_deps_dir \
    "--${target_language}_out" $root_dist_dir \
    $src_path/*.proto
}

for service_dir in $services_dir/*/; do
  # Remove the trailing slash from the directory name
  service_dir=${service_dir%/}
  # Extract processed directory name from its full path
  tail_service_dir_name=$(basename "$service_dir")

  echo "Builing $tail_service_dir_name protos..."
  build_proto_service ${service_dir}

done

echo "All protobufs are successfully built!"
