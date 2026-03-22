Badge:
[![CI Pipeline for QA Project](https://github.com/vladhatos/qa-final-project-java/actions/workflows/ci.yml/badge.svg)](https://github.com/vladhatos/qa-final-project-java/actions/workflows/ci.yml)


1.CMD - mkdir src\test\java\com\vladhatos\tests  - s-au creat folderele necesare proiectului
2.config/ - am creat configurarea app.yaml care contine informatii despre API-ul care va fi accesat in test
3.in radacina proiectului am creat pom.xml care contine configuratia necesara pentru Maven
4.in tests/ am creat ApiTest.TXT care contine codul testului automat (Java) transpus in pseudocod. Acesta cauta app.yaml si testeaza endpoint-ul din acest fisier.
5.Git - git add/commit/push - a fost copiat totul in Github
6.Docker - am downloadat imaginea maven:3.8.5-openjdk-17
7.Am creat Dockerfile cu reteta proiectului
8.Docker - am construit imaginea qa-final-project-java
9.docker run --rm qa-final-project-java - testele sunt rulate local
10.docker tag qa-final-project-java vladhatos/qa-final-project-java:1.0 - am etichetat imaginea
11.docker push vladhatos/qa-final-project-java:1.0 - am publicat imaginea in Docker Hub
12.docker run --rm vladhatos/qa-final-project-java:1.0 - testele pot fi rulate de catre oricine, se face download la imaginea mea din Docker
13..github/workflows/ - ci.yml - am creat Pipeline-ul care ruleaza testele si publica imaginea Docker
14.Docker Hub - am creat un Token. In GitHub - am configurat 2 secrete (DOCKERHUB_USERNAME si DOCKERHUB_TOKEN)
16.Git - commit final cu ultimele modificari
