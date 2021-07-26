

![Licious-Cover.png](https://cdn.hashnode.com/res/hashnode/image/upload/v1627222293764/Pw-7okHW-.png)

# Concepts we Covered in this Project:

## Java


- java Basics
- Object printed programming 
- Collections
-ArrayLists, Strings, Threads.

# Android


- Linear Layout, Relative Layout, Constraint Layout.

- Text View, Button, Image Button, Edit Text.

- Intent Filters and Intent Communication.

- Card View, Scroll View, Image View.
-  Resources (Strings, Styles, Colors, Dimensions).
-  Recycler View
-  Permissions and Background Threads
-  Broadcast Receivers(Location, Internet, Bluetooth)
-  Retrofit & Glide
-  Fragments
-  View Pager
-  Threads
-  Firebase Real-time Data

## Project statement and Expectations:

we Had to clone the Licious App GUI pixels perfect and also connect the database
to firebase and implement cart functionality and payment gateways.
Thanks To our team members for successfully developing the App.

**here are some  UI images**

![Screenshot_2021-07-25-19-23-48-281_com.licious[1].jpg](https://cdn.hashnode.com/res/hashnode/image/upload/v1627221619121/aZfhQTOB9.jpeg)

**cart functionalities**



```

public void onClick(View v) {
                mBtnPlaceOrder.setVisibility(View.INVISIBLE);
                CartAnime.setVisibility(View.VISIBLE);
                CartAnime.playAnimation();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent=new Intent(getContext(), HomeActivity.class);
                        startActivity(intent);

                    }
                },6000);
}

``` 





![Screenshot_2021-07-25-19-28-24-501_com.masai.licious[1].jpg](https://cdn.hashnode.com/res/hashnode/image/upload/v1627221674376/RSr_l1TvAt.jpeg)

## Roles and Responsibilities
At the start of the project, we divided the App structure into branches and stacks 
so that it would be easy to work on GUI and Functionality part separately.
We are a group of three members, my teammates are Leena and MD. saveen.Two members focused on the UI and Design of the App. (Leena  &saveen)
The third member focused on the functionality part. (sainath reddy)

### Key learnings:
we have learned a real developer experience with my teammates, by dividing the project into fragments and collaborating with the help of Git - Github. we faced many git-conflict and errors in the deep approach of the project therefore solved it and presented the App in time

Hence our team has improved a lot in Build week. looking forward to solving more problems and Building Apps.

Thanks all
Happy coding

