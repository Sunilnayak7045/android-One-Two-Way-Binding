


Summary on one-way and two-way databinding

one-way -> "@{}"

two-way -> "@={}"

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
