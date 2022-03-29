

One-Way-Binding : 

-> Updating the views from the data source is a simple one-way binding. In that case, you'll only access data from the data source and update the layout.

-> In one-way binding, the data flow is one-directional. It’s named one-way databinding because there’s only one communication way: from observable to view.

dependencies:

android {


.
.

buildFeatures 
{
    dataBinding true
   }
   
}


    def lifecycle_version = "2.5.0-alpha05"
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
    implementation "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
