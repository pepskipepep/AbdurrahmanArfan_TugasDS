Feature: Test get request

  Background: Setup Data
    Given url baseUserURL
    And print "========= Ini test Get Feature ========"
    # define location schema
    * string jsonSchemaExpected = read('file:src/test/java/apitest/schema/getschema.json')

  @get @test
  Scenario: User login
    # declare variable userid
    * def username = 'pepskipepep'
    * def password = 'pepskipepep'

    # path
    When path '/login?username=' + username + '&password=' + password
    # http request method
    And method get
    # get status
    Then status 200