# language: en
# Autor: ingfray@gmail.com
Feature: Request Api Google

  @ApiGoogle @Regretion
  Scenario Outline: Send request Api Google
    Given I send request <url>
    Then I see the status code <statusCode>
    Examples:
      |         url           | statusCode |
      | https://google.com    |    200     |

