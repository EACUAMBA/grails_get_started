# Reading Docs

Generating war using other environments
``grails [env] war``

Running a war using java without a Java container like tomcat 
```
grails war
java -Dgrails.env=prod -jar build/libs/mywar-0.1.war
```

Running with memory allocation
``-server -Xmx768M``