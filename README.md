# README

## Referências

- https://caju.notion.site/Desafio-T-cnico-para-fazer-em-casa-218d49808fe14a4189c3ca664857de72
- https://www.uuidgenerator.net/

## Json Input

```
{
	"account": "123",
	"totalAmount": 100.00,
	"mcc": "5811",
	"merchant": "PADARIA DO ZE               SAO PAULO BR"
}
```

## TODO

13 results - 10 files

README.md:
  18  
  19: ## TODO

src/main/java/br/com/fllsouto/interviews/caju/cca/api/controller/AccountController.java:
  36  
  37:     @PostMapping //TODO: Validate input data
  38      public AccountOutput create(@RequestBody CreateAccountForm form) {

src/main/java/br/com/fllsouto/interviews/caju/cca/api/controller/AuthorizationController.java:
  21  
  22:     // TODO: Validate input data
  23      @PostMapping

src/main/java/br/com/fllsouto/interviews/caju/cca/api/controller/MerchantController.java:
  37  
  38:     @PostMapping //TODO: Validate input data
  39      public MerchantOutput createMerchant(@RequestBody CreateMerchantForm input) {

src/main/java/br/com/fllsouto/interviews/caju/cca/domain/model/Account.java:
  51  
  52:     // TODO: REMOVE THIS
  53      public static Account mainAccount() {

  71          System.out.println(this);
  72:         // TODO: Extract repetition
  73          switch (merchType) {

src/main/java/br/com/fllsouto/interviews/caju/cca/service/adapters/MerchantServiceImpl.java:
  30  
  31:     //TODO: FIX THIS
  32      @Override

  36      
  37:     //TODO: FIX THIS
  38      @Override

  42      
  43:     //TODO: FIX THIS
  44      @Override

src/main/java/br/com/fllsouto/interviews/caju/cca/usecase/account/CreateAccountUCImpl.java:
  7  
  8: // TODO: Change to port and adapters naming convention
  9  public class CreateAccountUCImpl implements IAccountUC{

src/main/java/br/com/fllsouto/interviews/caju/cca/usecase/authorization/BasicAuthorizationUCImpl.java:
  17  
  18:     // // TODO: Refactor this after testing!
  19      @Override

src/main/java/br/com/fllsouto/interviews/caju/cca/usecase/authorization/FallbackAuthorizationUCImpl.java:
  20  
  21:     // TODO: Refactor this after testing!
  22      @Override

src/main/java/br/com/fllsouto/interviews/caju/cca/usecase/authorization/ValidateAuthorizationUCImpl.java:
  21  
  22:     // TODO: Refactor this after testing!
  23      @Override


---

- L4
- Testes de unidade, integração e contrato
- Documentação
- Pente fino