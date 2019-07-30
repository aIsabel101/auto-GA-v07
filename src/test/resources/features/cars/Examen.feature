Feature: Examen SITIO WEB A: https://api.nasa.gov/
  Scenario: Validar "Login" label en la pagina de LOGIN
    Given I load PHP travels
      And  Click NASA API Listing
      And  Second Click NASA API Listing
      And  click Earth
      And click Imagery

