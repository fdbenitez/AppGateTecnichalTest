# AppGateTecnichalTest

Download Code
Git command:

git clone https://github.com/fdbenitez/AppGateTecnichalTest.git
cd AppGateTecnichalTest

Execute Suite

Gradle command:
    gradle test aggregate
    
The previous instructions will execute the cucumber features using Cucumber's JUnit runner. The following annotation @RunWith(CucumberWithSerenity.class) is used to run the Suites classes, located on the Runners folder.

By default both commands will be executed on the Staging environment, if you want to execute it on a different environment, please provide the parameter -Denvironment

Example:

gradle test aggregate -Denvironment=dev


Accepted values:

dev = Development environment

prod = Production environment

Get Execution Reports open the index.htm file located on target/site/serenity directory.
