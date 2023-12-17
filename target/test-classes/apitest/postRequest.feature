Feature: Post test

  Background:
    Given url baseURL
    And print "------- ini adalah test post"
    * def body = {
        "id": 0,
        "username": "pepskipepep",
        "firstName": "pep",
        "lastName": "skipepep",
        "email": "pep@skipepep.pep",
        "password": "pepskipepep",
        "phone": "0812pepskipepep",
        "userStatus": 0
      }
    * def headerRegress = { Accept: 'application/json'}

  @post @test
  Scenario: Regress test post
    When path
    And method post
    And headers headerRegress
    And request body
    Then status 201
    And print response
    And match response == { id:'#string',createdAt:'#string' }

