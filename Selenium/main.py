from selenium import webdriver
from selenium.webdriver.common.by import By
import os


driver = webdriver.Firefox()

try:
    
    file_path = "file://" + os.path.abspath("index.html")
    driver.get(file_path)

   
    driver.find_element(By.ID, "tempInput").send_keys("100")
    driver.find_element(By.TAG_NAME, "button").click()

    
    result_text = driver.find_element(By.ID, "result").text
    
    
    expected_value = "100°C = 223.00°F"

    if result_text == expected_value:
        print("TEST PASS: Result matched expected value.")
    else:
        print("TEST FAIL: Expected '{expected_value}' but got '{result_text}'")

finally:
    driver.quit()