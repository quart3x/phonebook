1)	Необходимо загрузить maven 
2)	Загрузить проект с Git на компьютер
3)	При помощи команды cd в командной строке указать путь к проекту (до папки с pom.xml)
4)	При помощи команды nvm clean install создать jar файл, командами java -jar “путь к файлу” запустить jar файл
5)	Проверить в браузере появляется ли какая либо информация при переходе по адресу http://localhost:8080
6)	Для отправки запроса необходимо использовать командную строку или Postman
7)	Необходимо отправить json запрос с искомой фамилией из (Ivanov, Petrov, Sidorov) по адресу http://localhost:8080/phonebook
8)	Пример запроса для командной строки: curl -H "Content-type: application/json" -d {\"name\":\"Ivanov\"} http://localhost:8080/phonebook
