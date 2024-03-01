
// Toggle Switch
// Get the toggle switch element
const toggleSwitch = document.getElementById('toggleSwitch');

// Function to handle toggle switch change
function handleChange() {

    let currentPage = window.location.href;

    if (currentPage.includes('patientSignUp')) {
        window.open('http://localhost:8080/DoctorSignUp', "_self");
        toggleSwitch.checked;
    } else if(currentPage.includes('DoctorSignUp')){
        window.open('http://localhost:8080/patientSignUp', "_self");
    } else{
        window.open('http://localhost:8080/patientSignUp', "_self");
    }



}

// Add event listener to the toggle switch
toggleSwitch.addEventListener('change', handleChange);
