@prompt
  Feature: prompt
    Scenario: prompt assertion
      Given "tapAz" sitesine gidilir
      And email kutusuna yanlis mail girilir
      And devam et butonuna basilir
      Then girilemediği prompt ile dogrulanir

