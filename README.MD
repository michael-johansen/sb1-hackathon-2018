# Readme

    

## Forslag til bruksområde 
### API (dokumentasjon/utviklerportal?)

Klienter av api kan hente ferdige moduler for validering og dto-objekter for jvm og javascript-språk. Man kan gjøre en del syntaktiske valideringer på klientsiden, mens de semantiske må gjøres i serverside og kan ikke eksponeres. Ie. mod11-validering på konto kan gjøres på klientside mens tilgangssjekk må gjøres på serveren. 

### Deling av valideringslogikk mellom frontend og backend i apper

shared-validation-js kan benyttes av frontend
shared-validation-jvm kan benyttes av backend

## Extended scope
- HTTP-klient for jvm/js
