lazy val common = project
lazy val chapter3_001_messaging = project.dependsOn(common % "test->test;compile->compile")
lazy val chapter3_002_elasticity = project.dependsOn(common % "test->test;compile->compile")
