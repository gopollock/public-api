# Protobuf interface generation

## Installation

Google provides support of generating protobufs for most of popular languages using `protoc`.  

To install protoc following a [google guidance](https://grpc.io/docs/protoc-installation/):

**Linux**
```
apt install -y protobuf-compiler
protoc --version  # Ensure compiler version is 3+
```
**Macos**
```
brew install protobuf
protoc --version  # Ensure compiler version is 3+
```

## Generation

### Strait-forward
The simplest way to generate and consume protobufs in you code is to:
1. submodule this repository (or simply copy it) into yours repository.
2. Run `/public-api/proto-genrators/generate_protos.sh ${language}` script, which generates protobufs.

The list of supported params instead of `${language}` are: ("php" "java" "python" "cpp" "csharp" "dart" "go" "kotlin" "objc" "ruby")

### Own script
Another more custom approach would be to:
1. Clone all .proto file definitions from this repository.
2. Create your own proto generation script, where you could control input and output directories for each service.

Here you could find [a `protoc` CLI documentation](https://protobuf.dev/overview/).

## Code dependency

Additionally, to protobuf generated classes you would need a protobuf community library dependency in your project. It is used to resolve some common classes implementations like Timestamp, Duration, etc.

**PHP**:
```
pecl install protobuf
```

**Java**:
```
dependencies {
  implementation 'com.google.protobuf:protobuf-java:3.18.0'
}
```

**Javascript**
```
npm install protobuf
```
