#  DigitalBank-API

API RESTful de alta performance desenvolvida em Java e Spring Boot para simulação de operações financeiras. Este projeto consolida a migração estratégica de um sistema legado via terminal para uma arquitetura web moderna, scalável e integrada a banco de dados relacional.

##  O que diferencia este projeto? (Destaques Técnicos)
- **Persistência e Integridade:** Mapeamento de entidades complexas e relacionamentos utilizando Spring Data JPA e Hibernate.
- **Tratamento de Transações:** Uso estratégico do `@Transactional` para garantir que nenhuma operação financeira falhe pela metade, mantendo a consistência absoluta dos saldos.
- **Evolução de Arquitetura:** Refatoração completa de código estruturado terminal para o padrão MVC (Model-View-Controller) na Web.

## Funcionalidades Implementadas
- **Core Banking:** Estruturação de contas e gerenciamento automatizado de saldos.
- **Mecanismo de Movimentações:** Operações de depósitos e saques integradas diretamente ao banco MySQL.
- **Engine de Transferências:** Sistema de movimentação de valores entre contas com validações de segurança e consistência (venha conferir a lógica no código do `Service`!).
- **Auditoria Activa:** Listagem e persistência de históricos operacionais.

##  Tecnologias e Ecossistema
- **Back-end:** Java 17 / Spring Boot 3 / Spring Web
- **Persistência & Banco:** Spring Data JPA / MySQL Server
- **Build & Dependências:** Maven

---
 *Dica para Recrutadores: Os principais desafios técnicos de consistência de saldo e isolamento de transações foram resolvidos dentro das camadas de Service. Explore o código-fonte para avaliar a implementação ou entre em contato!*

 [LinkedIn](https://linkedin.com) |  joaovitorsantosdevjava@gmail.com
