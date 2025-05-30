public class MyCalculator { 
    public Double val1 { get; set; }
    public Double val2 { get; set; }
    public Double result { get; set; }
    public String func { get; set; }

    // Constructor with default values
    public MyCalculator() {
        val1 = 0;
        val2 = 0;
        result = 0;
        func = 'add'; // Default operation
    }

    // Method to populate dropdown options
    public List<SelectOption> getOperations() {
        List<SelectOption> options = new List<SelectOption>();
        options.add(new SelectOption('add', 'Addition (+)'));
        options.add(new SelectOption('sub', 'Subtraction (-)'));
        options.add(new SelectOption('mul', 'Multiplication (×)'));
        options.add(new SelectOption('div', 'Division (/)'));
        options.add(new SelectOption('mod', 'Modulo (%)'));
        return options;
    }

    // Calculation method
    public void finds() {
        if (func == 'add') {
            result = val1 + val2;
        } else if (func == 'sub') {
            result = val1 - val2;
        } else if (func == 'mul') {
            result = val1 * val2;
        } else if (func == 'div') {
            if (val2 == 0) {
                ApexPages.addMessage(new ApexPages.Message(ApexPages.Severity.ERROR, 'Division by zero is not allowed.'));
                return;
            }
            result = val1 / val2;
        } else if (func == 'mod') {
            if (val2 == 0) {
                ApexPages.addMessage(new ApexPages.Message(ApexPages.Severity.ERROR, 'Modulo by zero is not allowed.'));
                return;
            }
            Integer temp = Math.mod(Integer.valueOf(val1), Integer.valueOf(val2));
            result = Double.valueOf(temp);
        } else {
            ApexPages.addMessage(new ApexPages.Message(ApexPages.Severity.ERROR, 'Invalid operation selected.'));
        }
    }
}
