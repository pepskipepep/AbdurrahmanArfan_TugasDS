Feature: Test get request

  Background: Setup Data
    Given url baseURL
    And print "========= Ini test Get Data ========"
    # define location schema
    * string jsonSchemaExpected = read('file:src/test/java/apitest/schema/getschema.json')

  @get @test
  Scenario: User login
    # declare variable userid
    * def username = 'user1'

    # path
    When path '/login/' + username
    # http request method
    And method get
    # get status
    Then status 200
    # Assertion body response : id
    And print response
    And assert response.data.id == 909909
    And assert response.data.username == 'user1'
    And assert response.data.firstName == 'user1F'
    And assert response.data.lastName == 'user1L'
    And assert response.data.email == 'test@gmail.com'
    And assert response.data.password == 'test'
    And assert response.data.phone == '9810222889'
    And assert response.data.userStatus == 0