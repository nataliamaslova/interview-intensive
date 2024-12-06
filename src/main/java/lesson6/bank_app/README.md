Bank app

Bank app shows one account
- show the balance
- transfer money to another account
- switch to another account

Accounts:
- Corporate
- Personal

--------
Начинаем с описания сущностей, их внутреннего состояния 
и взаимодействия, т.е. методов, которые сущности
будут реализовывать

Account 
- id // immutable
- number // immutable
- name // immutable
- type (Corporate, Personal) // immutable
- balance // mutable

Bank app
- accounts
- activeAccount

- show the balance - the balance of current account
- transfer - from the current, to another account
- switch to account (id) - change of current account