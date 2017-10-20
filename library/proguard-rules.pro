# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in /Users/guoyang/Developer/android-sdk-macosx/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

#ProcessKeeper
-keep class com.carmelo.processkeeper.NativeDaemonBase{*;}
-keep class com.carmelo.processkeeper.nativ.NativeDaemonAPI20{*;}
-keep class com.carmelo.processkeeper.nativ.NativeDaemonAPI21{*;}
-keep class com.carmelo.processkeeper.DaemonApplication{*;}
-keep class com.carmelo.processkeeper.DaemonClient{*;}
-keepattributes Exceptions,InnerClasses,...
-keep class com.carmelo.processkeeper.DaemonConfigurations{*;}
-keep class com.carmelo.processkeeper.DaemonConfigurations$*{*;}