# Issue when using URL in native mode

This project demonstrates a bug in native mode when using URL data.

Running:

> mvn package -Pnative

leads to the following error:

> Error: com.oracle.svm.hosted.substitute.DeletedElementException: Unsupported field java.net.URL.handlers is reachable

This seems to be a GraalVM limitation/decision: https://github.com/oracle/graal/issues/1721

Having URL data is a relatively common use case. Is there any standard recommandation, workaround for Quarkus users?