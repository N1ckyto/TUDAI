// Generate a random CAPTCHA
function generateCaptcha() {
    let captcha = '';
    const characters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';

    for (let i = 0; i < 6; i++) {
        captcha += characters.charAt(Math.floor(Math.random() * characters.length));
    }

    return captcha;
}

// Display the generated CAPTCHA
function displayCaptcha() {
    const captchaElement = document.getElementById('captcha');
    const captcha = generateCaptcha();
    captchaElement.innerText = captcha;
    captchaElement.dataset.solution = captcha; // Store the solution as a data attribute
}

// Refresh CAPTCHA
function refreshCaptcha() {
    displayCaptcha();
}

// Validate user input against CAPTCHA solution
function validateCaptcha() {
    const userInput = document.getElementById('userInput').value;
    const captchaSolution = document.getElementById('captcha').dataset.solution;

    if (userInput === captchaSolution) {
        alert('CAPTCHA validation successful!');
    } else {
        alert('CAPTCHA validation failed. Please try again.');
        displayCaptcha(); // Refresh CAPTCHA on validation failure
    }
}

// Initial display of CAPTCHA when page loads
displayCaptcha();
