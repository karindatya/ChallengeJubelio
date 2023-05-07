@All
Feature: Persediaan

  @TestPersediaan
  Scenario: Persediaan
    And User click barang
    And User click persediaan
    And User verify penyesuaian persediaan
    And User click penyesuaian persediaan
    And User choose product
    And User fill quantity
    And User click simpan button
    Then User redirect to persediaan page

