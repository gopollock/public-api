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
source_path="${this_script_path}/classtime/service/proto"
dist_path="${this_script_path}/generated-protos"

echo "Builing protos..."
mkdir -p $dist_path
protoc \
  --proto_path $source_path \
  "--${target_language}_out" $dist_path \
  $source_path/*.proto


echo "All protobufs are successfully built!"
