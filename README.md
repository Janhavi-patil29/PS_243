**AquaLens - Secure River Monitoring System**<br>
A smart mobile application developed for the Smart India Hackathon 2025 to modernize secure water level data collection from rivers using image processing. This project is designed for the Central Water Commission (CWC) to replace manual log entries with a secure, AI-driven, and tamper-proof digital system.<br><br>
***✨ Key Features***<br><br>
~AquaLens is packed with features to ensure data integrity, reliability, and ease of use for field personnel.<br>
~Dual-Layer Authentication: Ensures user is on-site with mandatory GPS geofencing plus on-site QR code scanning.<br>
~Live Image Verification: Enforces real-time photo capture for every reading, creating a verifiable visual record.<br>
~Intelligent Gauge Processing (IGP): An on-device AI model uses Computer Vision (YOLOv8 + OCR) to automatically read water levels from photos, reducing human error.<br>
~Blockchain Audit Trail: Every submission is cryptographically hashed and logged on a blockchain, creating a permanent, tamper-proof record for unparalleled data integrity.<br>
~Offline-First Architecture: Securely saves all data locally and syncs automatically when an internet connection is available, making it perfect for remote areas.<br>
~Predictive Risk Flagging: A server-side ML model analyzes water level trends to detect anomalies and flag suspicious readings for review.<br>
~Role-Based Dashboards: Provides secure, tailored interfaces for field personnel and supervisors.<br>
~Public Contribution Mode: Allows the public to upload images, enhancing crowd-sourced flood data.<br>

*💻 Technology Stack*<br>

This project leverages a modern, robust technology stack to deliver a scalable and efficient solution.<br>

**Component**    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   **Technology**<br>

1. Frontend (Mobile)	    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     Android Native (Kotlin), CameraX, Google Maps API, SQLite &                                                                        WorkManager for offline mode.

2. Backend (Server)	  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;       Node.js with Express.js for RESTful APIs.

3. AI/ML	  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;               Python, OpenCV, YOLOv8 (detection), Tesseract (OCR), deployed on-                                                                  device with TensorFlow Lite.

4. Database	    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;      PostgreSQL with PostGIS for efficient geospatial data handling.

5. Image Storage	 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    AWS S3 for secure and scalable object storage.

6. Blockchain	  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    Hyperledger Fabric or Ethereum Layer 2 for the immutable audit log.

***🚀 Getting Started***

Follow these instructions to get the project up and running on your local machine for development and testing.

Prerequisites:-
Android Studio: Latest stable version (Hedgehog or newer).

Physical Android Device: Recommended for testing camera and location features.

Google Maps API Key: Required to display maps in the app.

<br>***🤝 Acknowledgments***<br>
This project is developed as part of the Smart India Hackathon 2025.<br>

Problem statement provided by the Ministry of Jal Shakti (MoJS).<br>

Team: Tech_Titans123@
