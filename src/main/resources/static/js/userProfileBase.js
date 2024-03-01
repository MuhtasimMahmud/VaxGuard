// Get all navbar anchor tags
const navLinks = document.querySelectorAll('.nav-link');

// Function to handle click event
function handleClick(event) {
    // Prevent default link behavior
    event.preventDefault();

    // Remove 'active' class from all links
    navLinks.forEach(link => {
        link.classList.remove('active');
    });

    // Add 'active' class to clicked link
    event.target.classList.add('active');

    // Navigate to the href of the clicked link
    window.location.href = event.target.href;
}

// Add click event listener to each link
navLinks.forEach(link => {
    link.addEventListener('click', handleClick);

    // Check if the href of the link matches the current page URL
    if (link.href === window.location.href) {
        link.classList.add('active');
    }
});



// Toggle Switch
// Get the toggle switch element
const toggleSwitch = document.getElementById('toggleSwitch');

// Function to handle toggle switch change
function handleChange() {
    if (toggleSwitch.checked) {
        // If option 1 is selected, change the src of the iframe to page1.html
        document.getElementById('iframe').src = 'signUp.html';

        // Alternatively, if you want to redirect the user to another page, you can use:
        // window.location.href = 'page1.html';
    } else {
        // If option 2 is selected, change the src of the iframe to page2.html
        document.getElementById('iframe').src = 'DoctorSignUp.html';

        // Alternatively, if you want to redirect the user to another page, you can use:
        // window.location.href = 'page2.html';
    }
}

// Add event listener to the toggle switch
toggleSwitch.addEventListener('change', handleChange);

