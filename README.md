# Домашнее задание к занятию 11 «Teamcity»



## Подготовка к выполнению

Сервер Teamcity, агент и nexus запущены в докере.

[Docker compose file](https://github.com/5793409/teamcity-netology/blob/master/teamcity-docker/compose.yml)

## Выполнение

1. Подключаем и авторизуем агент
  ![alt text](screenshots/1.png)

2. Создаем проект с привязкой на github
   ![alt text](screenshots/2.png)

3. Проходим автодетект конфигурации
   ![alt text](screenshots/3.png)

4. Проходим первую сборку, в первой интерации  будет только тестирование, поскольку репозиторий для артефактов еще не подключен.
    ![alt text](screenshots/4.png)

5. меняем  условия сборки: если сборка по ветке master, то должен происходит mvn clean deploy, иначе mvn clean test, разница - в подключенном settings.xml для выгрузки артефакта в nexus
   ![alt text](screenshots/5.png)

6. Если было обновление в ветке мастер и пройдены тесты, происходит выгрузка артефакта в nexus. .jar в артефактах сборки
 ![alt text](screenshots/6.png)

7. Настраиваем выгрузку конфигурацию проекта TeamCity в github и выгружаем
     ![alt text](screenshots/7.png)

   конфигурация выгружена в github
    ![alt text](screenshots/8.png)

8. Создал новую ветку  feature/add_reply , добавил новый метод для класса Welcomer, дополнил тест.
   
Результат - счетчик тестов увеличен, поскольку ветка не мастер, артекфакты не выгружались.
    ![alt text](screenshots/9.png)

---

### Решение задания
