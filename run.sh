#!/bin/bash

# Simple script to compile and run Java DSA programs
# Usage: ./run.sh <topic> <ProgramName>
# Example: ./run.sh arrays TwoSum

if [ $# -ne 2 ]; then
    echo "Usage: ./run.sh <topic> <ProgramName>"
    echo "Example: ./run.sh arrays TwoSum"
    echo ""
    echo "Available topics:"
    echo "  arrays, stacks, queues, trees, graphs, sorting"
    echo "  searching, dp, greedy, backtracking"
    exit 1
fi

TOPIC=$1
PROGRAM=$2
JAVA_FILE="programs/$TOPIC/$PROGRAM.java"

# Check if file exists
if [ ! -f "$JAVA_FILE" ]; then
    echo "Error: File $JAVA_FILE not found!"
    echo "Available programs in $TOPIC:"
    ls programs/$TOPIC/ 2>/dev/null || echo "  (No programs found)"
    exit 1
fi

echo "🔨 Compiling $PROGRAM.java..."
cd programs/$TOPIC
javac $PROGRAM.java

if [ $? -eq 0 ]; then
    echo "✅ Compilation successful!"
    echo "🚀 Running $PROGRAM..."
    echo "----------------------------------------"
    java $PROGRAM
    echo "----------------------------------------"
    echo "✅ Execution completed!"
else
    echo "❌ Compilation failed!"
    exit 1
fi
