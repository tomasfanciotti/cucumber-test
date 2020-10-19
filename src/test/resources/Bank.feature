Feature: Banco

  Scenario: Deposito en cuenta
    Given Dada una cuenta con 1500 pesos
    When Le deposito 8000 pesos
    Then Debo tener ahora 9500 pesos
