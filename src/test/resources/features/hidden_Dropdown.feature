
  Feature: hiddenDropdown
    @hiddenDropdown
    Scenario: hiddenDropdown
      Given gratise gidilir
      And searchboxa kantaron girilir
      Then onerilen ilk urunun kantaron sampuan oldugu dogrulanir

      Scenario: hiddenDropdown_2
        Given demoqa sitesine gidilir
        When State and Cityde NCR secilir
        Then NCR secildigi dogrulanir