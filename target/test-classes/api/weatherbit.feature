@alltestcase
Feature: Get weather details

@testcase1
Scenario: AC1. “I want to get the current weather data for a specific location based on lat and long”.
  Given I want to get the current weather data for a specific location based on 33.8688 and 151.2093 with status code 200


@testcase2
  Scenario: AC2. “I want to get the current weather data for multiple cities in the world”.
    Given I want to get the current weather data for multiple cities in the world with status code 403

@testcase3
  Scenario: AC3. “I want to get the current air quality data for a particular postcode”.
    Given I want to get the current air quality data for postcode = 3999 with status code 200