# navigationlearning

I did this project as an example of how to create navigation between Fragments, using one Activity as the Fragment holder

Libraries used:

* Android Navigation library: android.arch.navigation:navigation-fragment-ktx
* Google Material library: com.google.android.material:material


![NavBetweenFragments](https://user-images.githubusercontent.com/54866393/96145946-08652980-0f06-11eb-8030-ecc032b21aef.gif)


Functionallity:

- It starts from Fragment 1, then goes to fragment 2 and finally, ends up in fragment 3
- I can pass a number from Fragment 1 to Fragment 2, in case i dont introduce a number, it hands over a 0
- There is an Up button that keeps track of the navigation and can always go back.
- The drawer menu is removed when you are not in the first fragment and is replaced by the Up button
- When going back from Freagment 3, it goes back to Fragment 1; Fragment 2 was removed from the backstack.



![NavAboutViaMenu](https://user-images.githubusercontent.com/54866393/96145940-07cc9300-0f06-11eb-8327-4a0f00b07e37.gif)

By clicking the overflow menu, you go to the AboutFragment and by clicking the Up button, you go back to Fragment 1



