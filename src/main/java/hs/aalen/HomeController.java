package hs.aalen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return """
                <!DOCTYPE html>
                <html>
                <head>
                    <meta charset="UTF-8">
                    <title>CI/CD Demo Ist doch kacke ja</title>
                    <style>
                        body {
                            background: #0d1117;
                            color: #58a6ff;
                            font-family: monospace;
                            display: flex;
                            flex-direction: column;
                            align-items: center;
                            justify-content: center;
                            height: 100vh;
                            margin: 0;
                        }
                        h1 { font-size: 3em; }
                        .testbanner { font-size: 6em; color: #2ecc71; font-weight: bold; margin-bottom: 30px; }
                        p { color: #8b949e; font-size: 1.2em; }
                        .badge {
                            background: #238636;
                            color: white;
                            padding: 8px 20px;
                            border-radius: 20px;
                            font-size: 1em;
                            margin-top: 20px;
                        }
                    </style>
                </head>
                <body>
                    <div class="testbanner">test klappt</div>
                    <h1>🚀 CI/CD Demo Timo unser GOAT, Marius ist big </h1>
                    <p>Hochschule Aalen – Softwareengineering und Tools</p>
                    <p>Automatically deployed via GitHub Actions + Render</p>
                    <div class="badge">✅ Build successful</div>
                </body>
                </html>
                """;
    }
}
