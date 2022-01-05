
# Creating a Multi-Cloud Serverless Function Using Micronaut



Using the `mn` command option `feature-diff` from the root of a Micronaut project you can create a diff of the changes that need to be applied to enable a feature.

For example, to change our current lambda-based function to an Oracle Function we would execute the following command:

```
$ mn feature-diff --features oracle-function

... <snipped> 

 micronaut {
-    runtime("lambda")
+    runtime("oracle_function")
     testRuntime("junit5")
     processing {
         incremental(true)
@@ -20,13 +20,13 @@
 }
+
+
+dockerfileNative {
+  args("-XX:MaximumHeapSizePercent=80")
+}
+nativeImage {
+    args("--initialize-at-build-time=com.example")
+}
+dockerBuild {
+    images = ["[REGION].ocir.io/[TENANCY]/[REPO]/$project.name:$project.version"]
+}
+
+dockerBuildNative {
+    images = ["[REGION].ocir.io/[TENANCY]/[REPO]/$project.name-native:$project.version"]
+}
```

The output will recommend changes to your code to support an Oracle Function.
