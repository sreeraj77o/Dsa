# 🎯 Simple DSA Java Guide - For Beginners

This guide shows you **4 different ways** to compile and run Java programs, from simplest to most advanced. Choose the method that works best for you!

## 📁 NEW Simplified Project Structure
```
dsa-java/
├── programs/           # 🎉 All your code here! (Just 2 levels deep)
│   ├── arrays/         # Array problems
│   ├── stacks/         # Stack problems
│   ├── trees/          # Tree problems
│   ├── sorting/        # Sorting algorithms
│   └── ... (other topics)
├── run.sh             # Super simple script
├── compile.sh         # Compile-only script
└── SIMPLE_GUIDE.md    # This file
```

**🎉 Much simpler! Only 2 levels deep instead of 7!**

---

## 🚀 Method 1: Super Simple Script (RECOMMENDED for beginners)

### **One command to compile and run:**
```bash
./run.sh arrays TwoSum
```

### **That's it!** The script will:
- ✅ Compile your program
- ✅ Run it automatically
- ✅ Show clear success/error messages

### **Examples:**
```bash
./run.sh arrays TwoSum
./run.sh stacks ValidParentheses
./run.sh trees BinarySearch
```

---

## 🔨 Method 2: College Style (javac + java)

### **Step 1: Navigate to program folder**
```bash
cd programs/arrays
```

### **Step 2: Compile**
```bash
javac TwoSum.java
```

### **Step 3: Run**
```bash
java TwoSum
```

### **Complete Example:**
```bash
cd programs/arrays
javac TwoSum.java
java TwoSum
```

**🎉 Much simpler! No more complex package paths!**

---

## ⚡ Method 3: Compile-Only Script

### **Just compile (useful for checking syntax):**
```bash
./compile.sh arrays TwoSum
```

### **Then run manually:**
```bash
cd programs/arrays
java TwoSum
```

---

## 🏗️ Method 4: Maven (Advanced)

### **For when you need dependencies or testing:**
```bash
mvn compile exec:java -Dexec.mainClass="com.dsa.practice.arrays.TwoSum"
```

---

## 📝 Creating New Programs

### **1. Choose a topic folder:**
- `arrays/` - Array problems
- `stacks/` - Stack problems
- `queues/` - Queue problems
- `trees/` - Tree problems
- `graphs/` - Graph problems
- `sorting/` - Sorting algorithms
- `searching/` - Search algorithms
- `dp/` - Dynamic Programming problems
- `greedy/` - Greedy algorithms
- `backtracking/` - Backtracking problems

### **2. Create your Java file:**
```bash
# Example: Create a new array problem
touch programs/arrays/MaxSubarray.java
```

### **3. Use this template:**
```java
import java.util.Arrays;  // 🎉 Simple imports, no packages needed!

/**
 * Problem Name: Max Subarray
 * Description: Find the maximum sum of contiguous subarray
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class MaxSubarray {

    public static int maxSubArray(int[] nums) {
        // Your solution here
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("=== Max Subarray Problem ===");

        // Test case 1
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output: " + maxSubArray(nums1));
    }
}
```

### **4. Run your program:**
```bash
./run.sh arrays MaxSubarray
```

---

## 🎯 Quick Reference

| What you want to do | Command |
|---------------------|---------|
| **Run a program** | `./run.sh <topic> <ProgramName>` |
| **Just compile** | `./compile.sh <topic> <ProgramName>` |
| **College style** | `cd src/main/java && javac ... && java ...` |
| **Check if script works** | `./run.sh arrays TwoSum` |

---

## 🆘 Troubleshooting

### **Script not working?**
```bash
chmod +x run.sh
chmod +x compile.sh
```

### **File not found?**
- Check the file exists: `ls src/main/java/com/dsa/practice/arrays/`
- Check spelling of topic and program name

### **Compilation error?**
- Check your Java syntax
- Make sure package declaration matches folder structure
- Use `./compile.sh` to see detailed error messages

### **Want to see available programs?**
```bash
find programs -name "*.java" -type f
```

---

## 💡 Pro Tips

1. **Start with Method 1** (run.sh script) - it's the easiest
2. **Learn Method 2** (javac/java) - it's what most colleges teach
3. **Use Method 4** (Maven) only when you need external libraries
4. **Always include a main method** with test cases in your programs
5. **Follow the naming convention**: PascalCase for class names

---

## 🎉 You're Ready!

The complex Maven commands are now optional. You can focus on learning DSA with simple, beginner-friendly commands!

**Start with:** `./run.sh arrays TwoSum`
