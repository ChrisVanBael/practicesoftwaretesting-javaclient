# Practice Software Testing Java Client

This project generates a Java client library for the Practice Software Testing API.   
It is generated using [OpenAPI Generator](https://github.com/OpenAPITools/openapi-generator).  
OpenAPI spec can be found at [api-v2.practicesoftwaretesting.com](https://api-v1.practicesoftwaretesting.com).

If you want to generate other versions of the API, you need to:
- checkout another branch
or in pom.xml change
- the _\<version>0.1.0\</version>"_ property
- the _\<openapi.url>https://api-v2.practicesoftwaretesting.com/docs?api-docs.json\</openapi.url>_ property


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
mvn clean verify
```

This will:
- Download the latest OpenAPI specification from api-v1.practicesoftwaretesting.com
- Generate the Java client code in the \target\openapi directory
- Compile the sources
- Package all necessary files into jar files
- Generate .md5 and .sha1 checksums
- Copy the pom, jars and checksums to /target/upload directory

## Upload

Info on how to manually upload to FTP maven repository


### Detailed information on the maven phases:


| **Maven Phase**           | **ID **               | **Description**                                                                       | **Plugin**                 | **Goal**       |
|---------------------------|-----------------------|---------------------------------------------------------------------------------------|----------------------------|----------------|
| **generate-sources**      | download-openapi-spec | Downloads the OpenAPI spec from the specified URL to the project directory.           | `maven-antrun-plugin`      | `run`          |
| **generate-sources**      | generate-client-code  | OpenApi-generator generates the source code                                           | `openapi-generator-plugin` | `generate`     |
| **process-resources**     | default-resources     | Does nothing: no resources directory, executed by default                             | `resources`                | `resources`    |
| **process-sources**       | copy-generated-pom    | Copies the generated `pom.xml` file to the target directory after OpenAPI generation. | `maven-antrun-plugin`      | `run`          |
| **default-compile**       | default-compile       | Compiles the java code                                                                | `compiler`                 | `compile`      |
| **process-testresources** | default-resources     | Does nothing: no test resources directory, executed by default                        | `resources`                | `resources`    |
| **default-testCompile**   | default-testCompile   | Compiles the java test code                                                           | `compiler`                 | `testCompile`  |
| **default-test**          | default-test          | Runs the generated tests                                                              | `surefire`                 | `test`         |
| **package**               | default-jar           | Packages the compiled classes into the main JAR file for distribution.                | `maven-jar-plugin`         | `jar`          |
| **package**               | creates-tests-jar     | Packages the test classes into a separate `.jar` file for testing purposes.           | `maven-jar-plugin`         | `test-jar`     |
| **package**               | create-javadocs-jar   | Packages the generated Javadoc into a `.jar` file for distribution.                   | `maven-javadoc-plugin`     | `jar`          |
| **post-integration-test** | generate_checksums    | Generates MD5 and SHA-1 checksums for the `.jar`, `.pom`, and other necessary files.  | `checksum-maven-plugin`    | `files`        |
| **verify**                | copy-build-artifacts  | Copies build artifacts (e.g., `.jar`, `.pom`) to the upload directory for later use.  | `maven-antrun-plugin`      | `run`          |

