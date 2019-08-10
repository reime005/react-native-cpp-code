require 'json'

package = JSON.parse(File.read(File.join(__dir__, 'package.json')))

Pod::Spec.new do |s|
  s.name         = "RNCPPCode"
  s.version      = package['version']
  s.summary      = package['description']
  s.license      = package['license']

  s.authors      = package['author']
  s.homepage     = package['homepage']
  s.platforms    = { :ios => "9.0", :tvos => "9.2" }

  s.source       = { :git => "https://github.com/reime005/react-native-cpp-code.git", :tag => "s.version" }
  s.source_files  = "ios/**/*.{h,mm}", "cpp-code/**/*.{cpp,h}"

  s.dependency 'React'
end
