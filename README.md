# URL Encoder/Decoder Tool

This Java application allows users to encode or decode URL strings from the standard input. It's a simple command-line utility designed for quick and efficient processing of URL-related data.

## Installation

To use this tool, you need to have Java installed on your machine. If you don't have Java installed, download and install it from [Oracle's Java website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

## Build

### Java

To use the tool, you must compile the Java code and then run the resulting class file from the command line.

1. Compile the Java source file:
2. To encode a URL, simply run:

### Create binary

Run:
```
mvn package appassembler:assemble
```
You will find now a binary under `target/appassembler/bin/`

## Usage

Then, input your URL string into the standard input and press `Ctrl+D` (or `Ctrl+Z` on Windows) to end the input and see the encoded result.

3. To decode a URL, use the `-d` flag:


Input your encoded URL string, press `Ctrl+D` (or `Ctrl+Z` on Windows), and you will receive the decoded URL.

## Contributions

If you'd like to contribute to this tool, please fork the repository and submit a pull request.

## License

This tool is released under the MIT License. See the LICENSE file for more details.