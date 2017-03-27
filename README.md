Introduction
============

This archetype generates a small Maven project for testing via Selenide.

To install the archetype in your local repo:

	git clone https://github.com/cmprescott/maven-archetype-selenide.git
	cd maven-archetype-selenide
	mvn install

Now, you can use the archetype in a new project typing:

    mvn archetype:generate -DarchetypeGroupId=net.chrisprescott -DarchetypeArtifactId=maven-archetype-selenide -DarchetypeVersion=0.0.1-SNAPSHOT -DgroupId=<mygroupId> -DartifactId=<myartifactId>
    						 
where *mygroupId* : group id of the project you are creating; *myartifactId* : artifact id of the project you are creating

Credits
-------
The maven-archetype-selenide project is an open source project licensed under the Apache License 2.0.
