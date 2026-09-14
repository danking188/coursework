void check(boolean ok) { if (!ok) throw new AssertionError("Check failed"); }
void rejects(Runnable action) { try { action.run(); } catch (IllegalArgumentException expected) { return; } throw new AssertionError("Expected invalid input rejection"); }
check(Arrays.equals(average_grades(new int[][]{{80, 91}, {0, 100}}, new int[]{40, 60}), new int[]{86, 60}));
check(average_grades(new int[0][], new int[]{100}).length == 0);
rejects(() -> average_grades(null, new int[]{100}));
rejects(() -> average_grades(new int[][]{{80}}, new int[]{50}));
rejects(() -> average_grades(new int[][]{{80}}, new int[]{50, 50}));
rejects(() -> average_grades(new int[][]{{101}}, new int[]{100}));
rejects(() -> average_grades(new int[][]{{80, 90}}, new int[]{-1, 101}));
check(sphere(0) == 0);
check(Math.abs(sphere(2) - 4.0 / 3.0 * Math.PI) < 1e-12);
rejects(() -> sphere(-1));
rejects(() -> sphere(Double.NaN));
rejects(() -> sphere(Double.POSITIVE_INFINITY));
String rendered(int number) { var bytes = new ByteArrayOutputStream(); var original = System.out; try (var capture = new PrintStream(bytes)) { System.setOut(capture); display(number); } finally { System.setOut(original); } return bytes.toString(); }
check(rendered(0).lines().count() == 5);
check(rendered(-1).lines().toList().get(2).startsWith(" --  "));
check(rendered(Integer.MIN_VALUE).lines().count() == 5);
