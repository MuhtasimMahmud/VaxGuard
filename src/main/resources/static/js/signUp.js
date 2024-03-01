
// Toggle Switch
// Get the toggle switch element
const toggleSwitch = document.getElementById('toggleSwitch');

// Function to handle page change after toggle switch action
function handleChange() {

    let currentPage = window.location.href;

    if (currentPage.includes('patientSignUp')) {
        window.open('http://localhost:8080/hospitalSignUp', "_self");
    } else if(currentPage.includes('DoctorSignUp')){
        window.open('http://localhost:8080/patientSignUp', "_self");
    } else{
        window.open('http://localhost:8080/patientSignUp', "_self");
    }

    updateToggleSwitch();

}



// Function to update the toggle switch state based on the current page URL
function updateToggleSwitch() {
    var currentPage = window.location.href;

    if (currentPage.includes('hospitalSignUp')) {
        toggleSwitch.checked = true; // If on patientSignUp page, toggle switch is checked
    } else if (currentPage.includes('patientSignUp')) {
        toggleSwitch.checked = false; // If on DoctorSignUp page, toggle switch is unchecked
    }
}


// Add event listener to the toggle switch
toggleSwitch.addEventListener('change', handleChange);

// Call the updateToggleSwitch function to initialize the toggle switch state
updateToggleSwitch();