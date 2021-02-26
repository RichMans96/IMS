Coverage: 79.7%
# IMS Project

This was the first project assigned to me during trainging at the QA Consutling Academy. It's a simple Inventory Management System that uses CRUD to manipulate an SQL database from a CLI.
We also had to write test cases and aim for the industry stadard of 80% test coverage, more on that below.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

In order to get going you will need:
Eclipise or another IDE capable of openeing Java projects.
SQL installed locally.
Maven.
Java 14 or any stable version of Java.
And finally Git needs to be installed.


### Installing
Fork a copy and then run Git clone `url to your repo`.

Once cloned you will then need to run mvn install to make sure all dependecies are installed locally.

Then run mvn package clean, this will create a jar file with dependencies in the target folder.

Then to launch the application, either right click the fat jar in the project explorer and select show in > terminal or navigate to the project in cmd, git bash or any other terminal, then go into the target folder and run java -jar "file name" and then it will run in that terminal.

Follow the on screen menu, create a customer and an item first as an order needs both to be created.

## Running the tests

Explain how to run the automated tests for this system. Break down into which tests and what they do

### Unit Tests 

Explain what these tests test, why and how to run them

```
Give an example
```

### Integration Tests 
Explain what these tests test, why and how to run them

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)
* **Richard Mansworth** - *finished application* [RichMans96](https://github.com/RichMans96)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 


## Acknowledgments

* Hat tip to anyone whose code was used

