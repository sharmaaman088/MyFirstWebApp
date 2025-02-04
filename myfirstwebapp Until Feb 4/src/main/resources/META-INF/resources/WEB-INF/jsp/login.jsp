<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background: linear-gradient(to right, #74ebd5, #acb6e5);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .container {
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.2);
            padding: 40px;
            width: 350px;
            text-align: center;
            animation: fadeIn 1s ease-in-out;
        }

        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(-10px); }
            to { opacity: 1; transform: translateY(0); }
        }

        h1 {
            color: #333;
            font-size: 24px;
            margin-bottom: 15px;
        }

        .heart {
            color: red;
            font-size: 24px;
        }

        .welcome-message {
            font-size: 16px;
            color: #555;
            margin-bottom: 20px;
        }

        input[type="text"], input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 14px;
        }

        .login-button {
            width: 100%;
            padding: 12px;
            font-size: 16px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        .login-button:hover {
            background-color: #45a049;
        }

        footer {
            font-size: 12px;
            color: #777;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Welcome to the Login Page <span class="heart">&#10084;</span></h1>
        <p class="welcome-message">Hello, please log in to continue.</p>

        <!-- Display error message if login fails -->
        <pre>${errorMessage}</pre>

        <!-- Ensure form posts to the login controller -->
        <form action="login" method="post">
            <input type="text" name="name" placeholder="Enter your name" required>
            <input type="password" name="password" placeholder="Enter your password" required>
            <button type="submit" class="login-button">Login</button>
        </form>

        <footer>
            <p>&copy; 2025 Aman Sharma</p>
        </footer>
    </div>
</body>
</html>
