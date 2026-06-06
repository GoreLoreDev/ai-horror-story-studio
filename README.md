# AI Horror Story Studio

A Java-based interactive narrative engine for creating and playing branching horror stories using dynamic scene graphs, JSON-driven story loading, and a Swing GUI.

---

## Overview

AI Horror Story Studio is a desktop narrative engine built in Java that allows branching horror stories to be loaded dynamically from external JSON files instead of hardcoded Java logic.

The project focuses on:

* Object-oriented design
* Narrative graph architecture
* Dynamic story traversal
* Runtime graph reconstruction
* JSON parsing and data modeling
* Event-driven GUI systems
* Engine/UI separation

The application loads structured story data, reconstructs runtime scene graphs, and allows users to navigate interactive horror stories through a GUI.

---

## Features

### Narrative Engine

* Branching scene traversal
* Choice-based progression
* Scene graph architecture
* Dynamic runtime state management
* Fear level gameplay system
* Multiple scene types (NORMAL, ENDING, DEATH, etc.)

### JSON-Driven Story Loading

* External story storage using JSON
* Dynamic scene reconstruction
* Dynamic choice reconstruction
* Runtime graph linking using scene IDs
* Content-driven architecture

### GUI System

* Java Swing desktop interface
* Dynamic scene rendering
* Dynamic choice button generation
* Event-driven interaction system
* Live player status display
* Horror-themed interface styling

### Architecture Features

* Layered project structure
* Separation of engine and UI
* Data transfer object (DTO) pattern
* Two-pass graph reconstruction
* Encapsulation and reusable rendering systems

---

## Technologies Used

* Java
* Java Swing
* Gson (JSON parsing library)
* IntelliJ IDEA

---

## Project Structure

```text
src/
│
├── app/
│   └── Main.java
│
├── model/
│   ├── Story.java
│   ├── Scene.java
│   ├── Choice.java
│   ├── PlayerState.java
│   ├── SceneType.java
│   ├── StoryData.java
│   ├── SceneData.java
│   └── ChoiceData.java
│
├── service/
│   ├── StoryEngine.java
│   └── JsonLoader.java
│
└── ui/
    └── MainWindow.java

resources/
└── story.json
```

---

## How It Works

### Story Loading Pipeline

```text
story.json
    ↓
JsonLoader
    ↓
StoryData / SceneData / ChoiceData
    ↓
Runtime Story Graph Reconstruction
    ↓
StoryEngine
    ↓
Swing GUI Rendering
```

### Runtime Graph Reconstruction

The engine reconstructs branching narrative graphs dynamically from external JSON data.

Scenes are first created and indexed using scene IDs.

A second reconstruction pass dynamically connects choices to their target scenes.

This allows:

* branching traversal
* scalable story expansion
* external story authoring
* reusable engine architecture

---

## Example JSON Structure

```json
{
  "id": "intro",
  "title": "Abandoned Cabin",
  "content": "You enter a cold abandoned cabin deep in the forest.",
  "sceneType": "NORMAL",
  "fearEffect": 10,

  "choices": [
    {
      "text": "Open the basement door",
      "nextScene": "basement"
    }
  ]
}
```

---

## Current Status

Implemented:

* Dynamic story loading
* GUI traversal
* Runtime scene graph reconstruction
* JSON-based branching choices
* Fear level system
* Swing interface
* Engine/UI separation

Planned:

* Story validation system
* Broken link detection
* Unreachable scene analysis
* Save/load system
* Story editor
* AI-assisted story generation

---

## Learning Goals

This project was built to explore:

* Java OOP design
* Graph-based systems
* Runtime architecture
* JSON deserialization
* Swing GUI development
* Software engineering principles
* Data-driven application design

---

## Screenshots

<img width="1176" height="879" alt="Screenshot 2026-06-05 224919" src="https://github.com/user-attachments/assets/37cdacb5-ff03-47c5-b010-de602a1177e7" />
<img width="1172" height="874" alt="Screenshot 2026-06-05 224934" src="https://github.com/user-attachments/assets/550a0b98-affb-4d27-9396-001d3fb95fbb" />
<img width="1168" height="880" alt="Screenshot 2026-06-05 224957" src="https://github.com/user-attachments/assets/62255fb6-992a-4f05-b0df-b058da9c55b5" />



---

## Author

Anuran Paul