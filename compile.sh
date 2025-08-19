#!/bin/bash

# Simple script to compile Java DSA programs
# Usage: ./compile.sh <topic> <ProgramName>
# Example: ./compile.sh arrays TwoSum

if [ $# -ne 2 ]; then
    echo "Usage: ./compile.sh <topic> <ProgramName>"
    echo "Example: ./compile.sh arrays TwoSum"
    exit 1
fi

TOPIC=$1
PROGRAM=$2
JAVA_FILE="programs/$TOPIC/$PROGRAM.java"

# Check if file exists
if [ ! -f "$JAVA_FILE" ]; then
    echo "Error: File $JAVA_FILE not found!"
    exit 1
fi

echo "🔨 Compiling $PROGRAM.java..."
cd programs/$TOPIC
javac $PROGRAM.java

if [ $? -eq 0 ]; then
    echo "✅ Compilation successful!"
    echo "To run: cd programs/$TOPIC && java $PROGRAM"
else
    echo "❌ Compilation failed!"
    exit 1
fi
