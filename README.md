# Bluesplash

<h2>About</h2>

<p>Blue splash is a splash screen library, simple create your splash screen in less than 2 mins. </p>

# Usage


Add this to your build.grade:
```javascript
	repositories {
	//...
        maven { 
         url  "http://dl.bintray.com/santoshvarma4u/maven" 
         url "https://jitpack.io"
         }
    }
```

 Add the following to dependencies:
```javascript
	dependencies {
	         compile 'com.blue.splash:app:1.0.0'
	}
```

<h5>Usage of library</h5>
```java
//extends BlueSplash!
public class YourActivity extends BlueSplash {

	//DO NOT OVERRIDE onCreate()!
	//if you need to start some services do it in initSplash()!

	@Override
	public void initSplash(ConfigSplash configSplash) {

			/* you don't have to override every property */

			//Customize Circular Reveal
			configSplash.setBackgroundColor(R.color.primary); //any color you want form colors.xml
			configSplash.setAnimCircularRevealDuration(2000); //int ms
			configSplash.setRevealFlagX(Flags.REVEAL_RIGHT);  //or Flags.REVEAL_LEFT
			configSplash.setRevealFlagY(Flags.REVEAL_BOTTOM); //or Flags.REVEAL_TOP

			//Choose LOGO OR PATH; if you don't provide String value for path it's logo by default

			//Customize Logo
			configSplash.setLogoSplash(R.mipmap.ic_launcher); //or any other drawable
			configSplash.setAnimLogoSplashDuration(2000); //int ms
			configSplash.setAnimLogoSplashTechnique(Techniques.Bounce); //choose one form Techniques (ref: https://github.com/daimajia/AndroidViewAnimations)


			//Customize Path
			configSplash.setPathSplash(Constants.DROID_LOGO); //set path String
			configSplash.setOriginalHeight(400); //in relation to your svg (path) resource
			configSplash.setOriginalWidth(400); //in relation to your svg (path) resource
			configSplash.setAnimPathStrokeDrawingDuration(3000);
			configSplash.setPathSplashStrokeSize(3); //I advise value be <5
			configSplash.setPathSplashStrokeColor(R.color.accent); //any color you want form colors.xml
			configSplash.setAnimPathFillingDuration(3000);
			configSplash.setPathSplashFillColor(R.color.Wheat); //path object filling color


			//Customize Title
			configSplash.setTitleSplash("My Bluefrog App");
			configSplash.setTitleTextColor(R.color.Wheat);
			configSplash.setTitleTextSize(30f); //float value
			configSplash.setAnimTitleDuration(3000);
			configSplash.setAnimTitleTechnique(Techniques.FlipInX);
			configSplash.setTitleFont("fonts/myfont.ttf"); //provide string to your font located in assets/fonts/

	}

	@Override
	public void animationsFinished() {

			//transit to another activity here
			//or do whatever you want
	}
}
```

IMPORTANT: 
In order to set Animation Techniques to the Logo and/or App Title you need to add this to your dependencies

```javascript
	dependencies {
        compile 'com.nineoldandroids:library:2.4.0'
        compile 'com.daimajia.easing:library:1.0.1@aar'
        compile 'com.daimajia.androidanimations:library:1.1.3@aar'
            /* Fillable Loaders */
    	compile 'com.github.jorgecastilloprz:fillableloaders:1.02@aar'
	    /*Circular reveal*/
        compile 'com.github.ozodrukh:CircularReveal:1.1.1@aar'
}
```





