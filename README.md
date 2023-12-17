# Karate API Test

---

Homework 7 Automation API Testing
by: Abdurrahman Arfan

---

### For Running on the Console
- Run tests runner by className
 ```
  - mvn test -Dtest=${nameclassjava}
  Example : mvn test -DTest=RunSingle
  ```

- Run parallel all test 
 ```
mvn test "-Dkarate.options=--tags ~${nametag}"
Example : mvn test -DTest=RunAllTest
  ```

### Additional Tools
- JSON Schema
  - https://jsonschema.net

- JSON PathFinder
  - https://jsonpathfinder.com/

### Source Karate
- Documentation Karate
  - https://github.com/karatelabs/karate
