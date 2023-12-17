Feature: Delete request regress

  Background: Preparation
    Given url baseURL
    And print "This is Delete step preparation"

  @test
  Scenario: Test Delete data in regress
    * def username = 'user1'

    When path '/' + username
    And method delete
    Then status 204
    And print response