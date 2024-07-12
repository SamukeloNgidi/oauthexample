github
------
- settings >> developer settings >> oauth apps
- github: https://github.com/settings/applications/2638359


google
------
- settings >> developer settings
- setup OAuth concent screen
- create credentials for oauth2
- https://console.cloud.google.com/apis/credentials?project=spring-boot-application-429116&supportedpurview=project


NB:
---
- add the following to your application.properties file

spring.security.oauth2.client.registration.github.client-id=
spring.security.oauth2.client.registration.github.client-secret=

- Authorization callback URL
- http://localhost:8080/login/oauth2/code/github/
- just replace github with google for google authentication
