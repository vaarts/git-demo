@tag
Feature: User Certification

  @tag1
  Scenario: User is passed
    Given that the user "Vipul" is given a task to clear Java Certification exam
    When "Vipul" got 60 marks in exam
    Then Vipul is Java Certified

