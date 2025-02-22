# Practice Software Testing Java Client

This is a Java client library for the Practice Software Testing API. It is generated using the OpenAPI Generator from the API specification at [api-v1.practicesoftwaretesting.com](https://api-v1.practicesoftwaretesting.com).

## Requirements

- Java 17 or later
- Maven 3.8.1 or later

## Building from Source

1. Clone the repository:
```bash
git clone [repository-url]
cd practicesoftwaretesting-javaclient
```

2. Generate the API client code:
```bash
mvn clean generate-sources
```

This will:
- Download the latest OpenAPI specification from api-v1.practicesoftwaretesting.com
- Generate the Java client code
- Compile the sources

3. Build the project:
```bash
mvn clean package
```

This will create:
- The main JAR file
- Sources JAR
- JavaDoc JAR

TODO: generate .md5 and .sha1 checksums

## Upload

Info on how to manually upload to FTP maven repository